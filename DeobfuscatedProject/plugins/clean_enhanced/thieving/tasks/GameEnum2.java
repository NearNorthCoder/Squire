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

public final class GameEnum2
extends Enum<c> {
    
    private final  WorldPoint anchor;
    private final  WorldPoint curtainLocation;
    private static final  c[] $VALUES;
    private final  WorldPoint lureTo;
    private final  WorldArea area;
    public static final  /* enum */ c LADDER_HOUSE;
    public static final  /* enum */ c MENAPHITE_HOUSE;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public WorldPoint s() {
        return this.curtainLocation;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    private GameEnum2(WorldArea worldArea, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.area = worldArea;
        this.lureTo = worldPoint;
        this.anchor = worldPoint2;
        this.curtainLocation = worldPoint3;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void var10() {
        var1 = new String[var2[18]];
        c.var1[c.var2[0]] = "LADDER_HOUSE";
        c.var1[c.var2[8]] = "MENAPHITE_HOUSE";
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    public WorldArea p() {
        return this.area;
    }

    /*
     * WARNING - void declaration
     */
    public static c b(WorldPoint worldPoint) {
        void var18;
        c[] cArray = c.values();
        int n2 = cArray.length;
        int var19 = var2[0];
        while (c.var3(var19, (int)var18)) {
            WorldPoint var20;
            void var21;
            void var22 = var21[var19];
            if (c.var17(var22.p().contains(var20) ? 1 : 0)) {
                return var22;
            }
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return null;
    }

    public WorldPoint q() {
        return this.lureTo;
    }

    static {
        c.var23();
        c.var10();
        LADDER_HOUSE = new GameEnum2(new WorldArea(var2[1], var2[2], var2[3], var2[4], var2[0]), new WorldPoint(var2[5], var2[2], var2[0]), new WorldPoint(var2[1], var2[6], var2[0]), new WorldPoint(var2[5], var2[7], var2[0]));
        MENAPHITE_HOUSE = new GameEnum2(new WorldArea(var2[9], var2[10], var2[11], var2[4], var2[0]), new WorldPoint(var2[12], var2[13], var2[0]), new WorldPoint(var2[14], var2[15], var2[0]), new WorldPoint(var2[16], var2[17], var2[0]));
        c[] cArray = new c[var2[18]];
        cArray[c.var2[0]] = LADDER_HOUSE;
        cArray[c.var2[8]] = MENAPHITE_HOUSE;
        $VALUES = cArray;
    }

    private static void var23() {
        var2 = new int[20];
        c.var2[0] = (0x5A ^ 0x39 ^ (8 ^ 0x53)) & (0xA2 ^ 0xC6 ^ (0x3B ^ 0x67) ^ -1);
        c.var2[1] = 0xFFFFCFE7 & 0x3D3B;
        c.var2[2] = 0xFFFFAFFA & 0x5BBD;
        c.var2[3] = 3;
        c.var2[4] = 0xB2 ^ 0xAD ^ (0x28 ^ 0x33);
        c.var2[5] = -(0xFFFFBB13 & 0x54FF) & (0xFFFF9D76 & 0x7FBF);
        c.var2[6] = -(0xFFFFF78B & 0x6C7D) & (0xFFFFEFFF & 0x7FBD);
        c.var2[7] = -(0xFFFFEEFD & 0x354B) & (0xFFFFBFFF & 0x6FFF);
        c.var2[8] = 1;
        c.var2[9] = -(0xFFFFEFDF & 0x70E3) & (0xFFFFEDFE & 0x7FCF);
        c.var2[10] = -(0xFFFFFFEB & 0x5057) & (0xFFFFFFCB & 0x5BFF);
        c.var2[11] = 52 + 134 - 139 + 92 ^ 57 + 127 - 45 + 3;
        c.var2[12] = -(0xFFFFA3F9 & 0x7EB7) & (0xFFFFEFBF & 0x3FFF);
        c.var2[13] = -(0xFFFFECE7 & 0x777D) & (0xFFFFEFEE & Short.MAX_VALUE);
        c.var2[14] = -(0xFFFFBA0E & 0x57F3) & (0xFFFF9FB7 & 0x7F5B);
        c.var2[15] = 0xFFFFEBFF & 0x1F8D;
        c.var2[16] = 0xFFFFEF15 & 0x1DFB;
        c.var2[17] = 0xFFFFFBCF & 0xFBB;
        c.var2[18] = 2;
        c.var2[19] = 121 + 139 - 244 + 189 ^ 151 + 129 - 104 + 21;
    }

    public WorldPoint r() {
        return this.anchor;
    }
}

