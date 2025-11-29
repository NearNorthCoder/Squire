/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.hydra.tasks;

import java.awt.Color;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;

public final class GameEnum
extends Enum<k> {
    private final  int spriteId;
    private final  int specialProjectileId;
    private final  int hpThreshold;
    private final  WorldPoint fountainWorldPoint;
    public static final  /* enum */ k ENRAGED;
    public static final  /* enum */ k LIGHTNING;
    private final  Point fountainPlayerPoint;
    private final  int specialAnimationId;
    private final  int deathAnimation1;
    private final  int deathAnimation2;
    public static final  /* enum */ k FLAME;
    private final  Color phaseColor;
    private final  Color fountainColor;
    public static final  /* enum */ k POISON;
    private static final  k[] $VALUES;
    private final  int attacksPerSwitch;

    public int ab() {
        return this.deathAnimation1;
    }

    private static void var3() {
        var2 = new int[35];
        k.var2[0] = (36 + 214 - 86 + 56 ^ 88 + 82 - 121 + 102) & (0x44 ^ 0x6C ^ (0xF2 ^ 0x91) ^ -1);
        k.var2[1] = 1;
        k.var2[2] = 2;
        k.var2[3] = 3;
        k.var2[4] = -(0xFFFFBFF3 & 0x51DF) & (0xFFFFB5FF & 0x7BFF);
        k.var2[5] = 0xFFFFE1EE & 0x3E3F;
        k.var2[6] = 0xFFFFDEFE & 0x276D;
        k.var2[7] = -(0xFFFFFE77 & 0x98B) & (0xFFFFFF3F & 0xBFB);
        k.var2[8] = 0xFFFFBEFE & 0x47EF;
        k.var2[9] = 0xFFFFDD7B & 0x27DF;
        k.var2[10] = 0xFFFFBC17 & 0x6BFF;
        k.var2[11] = 0x2C ^ 0x58 ^ (0x7D ^ 0x30);
        k.var2[12] = 0x58 ^ 0x7F;
        k.var2[13] = 0xFFFFBF34 & 0x60FF;
        k.var2[14] = -(0xFFFFA3DF & 0x5D2B) & (0xFFFFBFFF & 0x613F);
        k.var2[15] = -(0xFFFFDF9F & 0x75E9) & (0xFFFFF7BB & 0x7DFD);
        k.var2[16] = -(0xFFFFFF7D & 0x2493) & (0xFFFFB6F6 & 0x6F3F);
        k.var2[17] = -(0xFFFFABDF & 0x7C79) & (0xFFFFBFFF & 0x6FFF);
        k.var2[18] = 0xFFFFFD28 & 0x2AF7;
        k.var2[19] = 0x52 ^ 0x61;
        k.var2[20] = 0xA9 ^ 0x9E ^ 1;
        k.var2[21] = 0x9F ^ 0x9B;
        k.var2[22] = 0xFFFFA5BB & 0x7A7F;
        k.var2[23] = -(0xFFFF95D3 & 0x7F6E) & (0xFFFFBF7F & 0x75FD);
        k.var2[24] = 0xFFFFFA7B & 0x25BC;
        k.var2[25] = 0xFFFFBB33 & 0x45DF;
        k.var2[26] = 0xFFFFF7DA & 0xF2D;
        k.var2[27] = -(0xFFFF82DD & 0x7F2F) & (0xFFFFE77E & 0x1FDF);
        k.var2[28] = 0x9E ^ 0xBA;
        k.var2[29] = 0x81 ^ 0xAF;
        k.var2[30] = 0xB ^ 0xE;
        k.var2[31] = -(0xFFFFDB9F & 0x3FFB) & (0xFFFFBBFF & 0x7FDB);
        k.var2[32] = -(0xFFFFEDBF & 0x1FE6) & (0xFFFFADE7 & Short.MAX_VALUE);
        k.var2[33] = 0x62 ^ 0x64;
        k.var2[34] = 0x8E ^ 0x86;
    }

    public int ae() {
        return this.specialAnimationId;
    }

    private GameEnum(int n3, int n4, int n5, int n6, int n7, int n8, int n9, WorldPoint worldPoint, Point point, Color color, Color color2) {
        this.attacksPerSwitch = n3;
        this.deathAnimation1 = n4;
        this.deathAnimation2 = n5;
        this.specialProjectileId = n6;
        this.specialAnimationId = n7;
        this.hpThreshold = n8;
        this.spriteId = n9;
        this.fountainWorldPoint = worldPoint;
        this.fountainPlayerPoint = point;
        this.phaseColor = color;
        this.fountainColor = color2;
    }

    static {
        k.var3();
        k.var4();
        POISON = new GameEnum(var2[3], var2[4], var2[5], var2[6], var2[0], var2[7], var2[8], new WorldPoint(var2[9], var2[10], var2[0]), new Point(var2[11], var2[12]), Color.GREEN, Color.RED);
        LIGHTNING = new GameEnum(var2[3], var2[13], var2[14], var2[0], var2[15], var2[16], var2[17], new WorldPoint(var2[9], var2[18], var2[0]), new Point(var2[19], var2[20]), Color.CYAN, Color.GREEN);
        FLAME = new GameEnum(var2[3], var2[22], var2[23], var2[0], var2[24], var2[25], var2[26], new WorldPoint(var2[27], var2[18], var2[0]), new Point(var2[28], var2[29]), Color.RED, Color.CYAN);
        ENRAGED = new GameEnum(var2[1], var2[31], var2[32], var2[6], var2[0], var2[0], var2[8], null, null, null, null);
        k[] kArray = new k[var2[21]];
        kArray[k.var2[0]] = POISON;
        kArray[k.var2[1]] = LIGHTNING;
        kArray[k.var2[2]] = FLAME;
        kArray[k.var2[3]] = ENRAGED;
        $VALUES = kArray;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (k.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 != (0x24 ^ 3 ^ (0x2F ^ 0xC))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public Color ah() {
        return this.phaseColor;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static void var4() {
        var1 = new String[var2[33]];
        k.var1[k.var2[0]] = "_";
        k.var1[k.var2[1]] = k.var16("4XpRIm9kSe0=", "mvDnc");
        k.var1[k.var2[2]] = "POISON";
        k.var1[k.var2[3]] = "LIGHTNING";
        k.var1[k.var2[21]] = "FLAME";
        k.var1[k.var2[30]] = "ENRAGED";
    }

    public RegionPoint Z() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        if (k.var17((Object)this, (Object)ENRAGED)) {
            return new RegionPoint(this.fountainPlayerPoint.getX(), this.fountainPlayerPoint.getY(), worldPoint.getPlane(), worldPoint.getRegionID());
        }
        return null;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    public Color ai() {
        return this.fountainColor;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var17(Object object, Object object2) {
        return object != object2;
    }

    public int aa() {
        return this.attacksPerSwitch;
    }

    public int ad() {
        return this.specialProjectileId;
    }

    public int af() {
        return this.hpThreshold;
    }

    public int ac() {
        return this.deathAnimation2;
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(var2[0]) + string.substring(var2[1]).replaceAll(var1[var2[0]], var1[var2[1]]).toLowerCase();
    }

    public WorldPoint ag() {
        return this.fountainWorldPoint;
    }
}

