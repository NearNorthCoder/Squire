/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.hunter.tasks;

import java.util.List;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum3
extends Enum<c> {
    public static final  /* enum */ c FELDIP_HILLS_SOUTH;

    public static final  /* enum */ c FELDIP_HILLS_NORTHWEST;
    private static final  c[] $VALUES;
    public static final  /* enum */ c ISLE_OF_SOULS;
    private final  WorldPoint center;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (c.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0 ^ 0x40 ^ (0x4C ^ 8)) >= 2) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        c.var14();
        c.var15();
        FELDIP_HILLS_SOUTH = new GameEnum3(new WorldPoint(var2[3], var2[4], var2[0]));
        ISLE_OF_SOULS = new GameEnum3(new WorldPoint(var2[5], var2[6], var2[0]));
        FELDIP_HILLS_NORTHWEST = new GameEnum3(new WorldPoint(var2[8], var2[9], var2[0]));
        c[] cArray = new c[var2[10]];
        cArray[c.var2[0]] = FELDIP_HILLS_SOUTH;
        cArray[c.var2[1]] = ISLE_OF_SOULS;
        cArray[c.var2[7]] = FELDIP_HILLS_NORTHWEST;
        $VALUES = cArray;
    }

    public WorldPoint l() {
        return this.center;
    }

    private static void var15() {
        var1 = new String[var2[10]];
        c.var1[c.var2[0]] = "FELDIP_HILLS_SOUTH";
        c.var1[c.var2[1]] = "ISLE_OF_SOULS";
        c.var1[c.var2[7]] = "FELDIP_HILLS_NORTHWEST";
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var14() {
        var2 = new int[11];
        c.var2[0] = (0xF7 ^ 0xAD) & ~(0xED ^ 0xB7);
        c.var2[1] = 1;
        c.var2[2] = -1;
        c.var2[3] = -(0xFFFFD2FD & 0x7D53) & (0xFFFFDBFF & 0x7E7F);
        c.var2[4] = 0xFFFFCBFB & 0x3F74;
        c.var2[5] = -(0xFFFFF3CB & 0x6D35) & (0xFFFFFDBF & 0x6BDD);
        c.var2[6] = -(0xFFFFF17F & 0x1ECD) & (0xFFFF9BDF & 0x7FFE);
        c.var2[7] = 2;
        c.var2[8] = 0xFFFFCBFF & 0x3DDF;
        c.var2[9] = 0xFFFFABF7 & 0x5F7F;
        c.var2[10] = 3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private GameEnum3(WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public List<WorldPoint> a(int n2) {
        WorldPoint worldPoint = this.center.dx(var2[0]).dy(var2[1]);
        WorldPoint worldPoint2 = this.center.dx(var2[0]).dy(var2[2]);
        WorldPoint worldPoint3 = this.center.dx(var2[1]).dy(var2[0]);
        WorldPoint worldPoint4 = this.center.dx(var2[2]).dy(var2[0]);
        WorldPoint worldPoint5 = this.center.dx(var2[1]).dy(var2[1]);
        WorldPoint worldPoint6 = this.center.dx(var2[2]).dy(var2[2]);
        return List.of(worldPoint, worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6).subList(var2[0], n2);
    }
}

