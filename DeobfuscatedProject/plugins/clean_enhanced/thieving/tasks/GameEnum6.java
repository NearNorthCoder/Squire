/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.thieving.tasks;

import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum6
extends Enum<h> {
    private final  WorldPoint location;
    private static final  h[] $VALUES;
    private final  String name;
    private final  WorldArea area;
    public static final  /* enum */ h CAKE_ARDOUGNE;
    public static final  /* enum */ h FRUIT_HOSIDIUS;
    private final  boolean ensureStanding;

    public boolean A() {
        return this.ensureStanding;
    }

    public WorldArea p() {
        return this.area;
    }

    private static void var3() {
        var1 = new String[var2[15]];
        h.var1[h.var2[0]] = "CAKE_ARDOUGNE";
        h.var1[h.var2[1]] = "Baker's stall";
        h.var1[h.var2[7]] = "FRUIT_HOSIDIUS";
        h.var1[h.var2[8]] = "Fruit Stall";
    }

    static {
        h.var4();
        h.var3();
        CAKE_ARDOUGNE = new GameEnum6(var1[var2[1]], new WorldPoint(var2[2], var2[3], var2[0]), new WorldArea(var2[4], var2[5], var2[6], var2[6], var2[0]), var2[1]);
        FRUIT_HOSIDIUS = new GameEnum6(var1[var2[8]], new WorldPoint(var2[9], var2[10], var2[0]), new WorldArea(var2[11], var2[12], var2[13], var2[14], var2[0]), var2[0]);
        h[] hArray = new h[var2[7]];
        hArray[h.var2[0]] = CAKE_ARDOUGNE;
        hArray[h.var2[1]] = FRUIT_HOSIDIUS;
        $VALUES = hArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var2 = new int[16];
        h.var2[0] = (0xA6 ^ 0x80) & ~(0x16 ^ 0x30);
        h.var2[1] = 1;
        h.var2[2] = -(0xFFFFFF91 & 0x317F) & (0xFFFFFBFF & 0x3F7D);
        h.var2[3] = -(0xFFFFFAFE & 0x713) & (0xFFFFDFFF & 0x2EFF);
        h.var2[4] = 0xFFFFBE6F & 0x4BF9;
        h.var2[5] = 0xFFFFCCFF & 0x3FEA;
        h.var2[6] = 0x47 ^ 0x40;
        h.var2[7] = 2;
        h.var2[8] = 3;
        h.var2[9] = -(0xFFFFBE7F & 0x79B6) & (0xFFFFFF3D & 0x3FFF);
        h.var2[10] = 0xFFFF9FFF & 0x6E17;
        h.var2[11] = -(0xFFFFFFDA & 0x58F7) & (0xFFFFFFF7 & 0x5FDB);
        h.var2[12] = -(0xFFFFBDEB & 0x63FE) & (0xFFFFBFFF & 0x6FFF);
        h.var2[13] = 5 ^ 0xC;
        h.var2[14] = 0xB6 ^ 0xB0;
        h.var2[15] = 0xC3 ^ 0xC7;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    public String v() {
        return this.name;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (h.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    public WorldPoint z() {
        return this.location;
    }

    private GameEnum6(String string2, WorldPoint worldPoint, WorldArea worldArea, boolean bl) {
        this.name = string2;
        this.location = worldPoint;
        this.area = worldArea;
        this.ensureStanding = bl;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }
}

