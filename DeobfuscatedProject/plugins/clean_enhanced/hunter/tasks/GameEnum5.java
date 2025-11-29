/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.hunter.tasks;

import java.util.List;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum5
extends Enum<d> {
    public static final  /* enum */ d FELDIP_HILLS_NORTH;
    public static final  /* enum */ d WILDERNESS_NORTH;
    
    public static final  /* enum */ d PISCATORIS_HUNTER_AREA;
    private static final  d[] $VALUES;
    private final  WorldPoint center;
    public static final  /* enum */ d FELDIP_HILLS_SOUTH;
    public static final  /* enum */ d RED_CHIN_HUNTING_GROUND;
    public static final  /* enum */ d GWENITH_HUNTER_AREA;
    public static final  /* enum */ d WILDERNESS_SOUTH;
    public static final  /* enum */ d ISLE_OF_SOULS;

    private static void var3() {
        var2 = new String[var1[25]];
        d.var2[d.var1[0]] = "WILDERNESS_NORTH";
        d.var2[d.var1[1]] = "WILDERNESS_SOUTH";
        d.var2[d.var1[7]] = "PISCATORIS_HUNTER_AREA";
        d.var2[d.var1[10]] = "ISLE_OF_SOULS";
        d.var2[d.var1[13]] = "FELDIP_HILLS_NORTH";
        d.var2[d.var1[16]] = "FELDIP_HILLS_SOUTH";
        d.var2[d.var1[19]] = "GWENITH_HUNTER_AREA";
        d.var2[d.var1[22]] = "RED_CHIN_HUNTING_GROUND";
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    static {
        d.var5();
        d.var3();
        WILDERNESS_NORTH = new GameEnum5(new WorldPoint(var1[3], var1[4], var1[0]));
        WILDERNESS_SOUTH = new GameEnum5(new WorldPoint(var1[5], var1[6], var1[0]));
        PISCATORIS_HUNTER_AREA = new GameEnum5(new WorldPoint(var1[8], var1[9], var1[0]));
        ISLE_OF_SOULS = new GameEnum5(new WorldPoint(var1[11], var1[12], var1[0]));
        FELDIP_HILLS_NORTH = new GameEnum5(new WorldPoint(var1[14], var1[15], var1[0]));
        FELDIP_HILLS_SOUTH = new GameEnum5(new WorldPoint(var1[17], var1[18], var1[0]));
        GWENITH_HUNTER_AREA = new GameEnum5(new WorldPoint(var1[20], var1[21], var1[0]));
        RED_CHIN_HUNTING_GROUND = new GameEnum5(new WorldPoint(var1[23], var1[24], var1[0]));
        d[] dArray = new d[var1[25]];
        dArray[d.var1[0]] = WILDERNESS_NORTH;
        dArray[d.var1[1]] = WILDERNESS_SOUTH;
        dArray[d.var1[7]] = PISCATORIS_HUNTER_AREA;
        dArray[d.var1[10]] = ISLE_OF_SOULS;
        dArray[d.var1[13]] = FELDIP_HILLS_NORTH;
        dArray[d.var1[16]] = FELDIP_HILLS_SOUTH;
        dArray[d.var1[19]] = GWENITH_HUNTER_AREA;
        dArray[d.var1[22]] = RED_CHIN_HUNTING_GROUND;
        $VALUES = dArray;
    }

    private GameEnum5(WorldPoint worldPoint) {
        this.center = worldPoint;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void var5() {
        var1 = new int[26];
        d.var1[0] = (0xB7 ^ 0xBB) & ~(0x9B ^ 0x97);
        d.var1[1] = 1;
        d.var1[2] = -1;
        d.var1[3] = 0xFFFF8FE6 & 0x7C59;
        d.var1[4] = -(0xFFFFEE9F & 0x7169) & (0xFFFFEEDF & 0x7FEF);
        d.var1[5] = 0xFFFFEC6F & 0x1FDA;
        d.var1[6] = -(0xFFFFC71F & 0x79E1) & (0xFFFFDFFD & 0x6FBF);
        d.var1[7] = 2;
        d.var1[8] = -(0xFFFFFDFF & 0x269D) & (0xFFFFADFC & 0x7FBF);
        d.var1[9] = -(0xFFFFF85B & 0x77BD) & (0xFFFFFFBD & 0x7E7B);
        d.var1[10] = 3;
        d.var1[11] = -(0xFFFFDFB3 & 0x776F) & (0xFFFFFF7F & 0x5FEE);
        d.var1[12] = 0xFFFFDFFD & 0x2B86;
        d.var1[13] = 0x9D ^ 0x99;
        d.var1[14] = 0xFFFFA9FE & 0x5FFD;
        d.var1[15] = -(0xFFFFFF8E & 0x30FB) & (0xFFFFBBFF & Short.MAX_VALUE);
        d.var1[16] = 110 + 94 - 162 + 104 ^ 43 + 18 - -85 + 5;
        d.var1[17] = -(0xFFFFF51D & 0x5EF7) & (0xFFFFFDFD & 0x5FDE);
        d.var1[18] = -(0xFFFFD6F7 & 0x7D39) & (0xFFFFFF73 & 0x5FFF);
        d.var1[19] = 0x4F ^ 0x49;
        d.var1[20] = -(0xFFFFEBAF & 0x575B) & (0xFFFFCFEF & 0x7BFE);
        d.var1[21] = 0xFFFF9D7E & 0x6FCD;
        d.var1[22] = 0x50 ^ 0x57;
        d.var1[23] = 0xFFFFFDDE & 0xBF3;
        d.var1[24] = -(0x72 ^ 0x41) & (0xFFFFBC7F & 0x67FF);
        d.var1[25] = 0x68 ^ 0x60;
    }

    public List<WorldPoint> a(int n2) {
        WorldPoint worldPoint = this.center.dx(var1[0]).dy(var1[1]);
        WorldPoint worldPoint2 = this.center.dx(var1[0]).dy(var1[2]);
        WorldPoint worldPoint3 = this.center.dx(var1[1]).dy(var1[0]);
        WorldPoint worldPoint4 = this.center.dx(var1[2]).dy(var1[0]);
        WorldPoint worldPoint5 = this.center.dx(var1[1]).dy(var1[1]);
        WorldPoint worldPoint6 = this.center.dx(var1[2]).dy(var1[2]);
        return List.of(worldPoint, worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6).subList(var1[0], n2);
    }

    public WorldPoint l() {
        return this.center;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (d.var4(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if ((0x12 ^ 0x16) == (0x12 ^ 0x16)) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

