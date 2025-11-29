/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.vardorvis.tasks;

import net.runelite.api.coords.WorldPoint;

public final class GameEnum6
extends Enum<f> {
    public static final  /* enum */ f VARROCK_WEST;
    private static final  f[] $VALUES;
    
    public static final  /* enum */ f GRAND_EXCHANGE;
    private final  int regionId;
    public static final  /* enum */ f CASTLE_WARS;
    private final  WorldPoint location;
    
    public static final  /* enum */ f FALADOR_WEST;

    private static void var3() {
        var1 = new int[17];
        f.var1[0] = (0xAC ^ 0x99 ^ (0x67 ^ 0x5A)) & (0x6F ^ 0xC ^ (0x39 ^ 0x52) ^ -1);
        f.var1[1] = 0xFFFFFB37 & 0x35FE;
        f.var1[2] = -(0xFFFFE3DB & 0x7EA5) & (0xFFFFFFFD & 0x6EDF);
        f.var1[3] = 0xFFFF9D9F & 0x6FFF;
        f.var1[4] = 1;
        f.var1[5] = 0xFFFFB33F & 0x7DF5;
        f.var1[6] = -(0xFFFFF2F9 & 0x6D0F) & (0xFFFFED7F & 0x7EF9);
        f.var1[7] = -(0x2F ^ 0x28) & (0xFFFFAD7E & 0x5FF7);
        f.var1[8] = 2;
        f.var1[9] = -(0xFFFFCDCF & 0x73FB) & (0xFFFFFFFF & 0x6FFE);
        f.var1[10] = 0xFFFFEF82 & 0x1BFF;
        f.var1[11] = 0xFFFFFDA9 & 0xF7E;
        f.var1[12] = 3;
        f.var1[13] = 0xFFFFAFB4 & 0x767B;
        f.var1[14] = 0xFFFFEBDB & 0x1DAF;
        f.var1[15] = -(0xFFFFF3DD & 0x1EE7) & (0xFFFFFFFF & 0x1ECF);
        f.var1[16] = 0x1D ^ 3 ^ (0x3C ^ 0x26);
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static void var5() {
        var2 = new String[var1[16]];
        f.var2[f.var1[0]] = "GRAND_EXCHANGE";
        f.var2[f.var1[4]] = "VARROCK_WEST";
        f.var2[f.var1[8]] = "FALADOR_WEST";
        f.var2[f.var1[12]] = "CASTLE_WARS";
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (f.var4(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    static {
        f.var3();
        f.var5();
        GRAND_EXCHANGE = new GameEnum6(var1[1], new WorldPoint(var1[2], var1[3], var1[0]));
        VARROCK_WEST = new GameEnum6(var1[5], new WorldPoint(var1[6], var1[7], var1[0]));
        FALADOR_WEST = new GameEnum6(var1[9], new WorldPoint(var1[10], var1[11], var1[0]));
        CASTLE_WARS = new GameEnum6(var1[13], new WorldPoint(var1[14], var1[15], var1[0]));
        f[] fArray = new f[var1[16]];
        fArray[f.var1[0]] = GRAND_EXCHANGE;
        fArray[f.var1[4]] = VARROCK_WEST;
        fArray[f.var1[8]] = FALADOR_WEST;
        fArray[f.var1[12]] = CASTLE_WARS;
        $VALUES = fArray;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    public WorldPoint F() {
        return this.location;
    }

    private GameEnum6(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.regionId;
    }
}

