/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.game.ItemManager
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum;
import java.awt.image.BufferedImage;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.game.ItemManager;

public final class GameEnum4
extends Enum<d> {
    public static final  /* enum */ d WATER;
    public static final  /* enum */ d LAW;
    public static final  /* enum */ d NATURE;
    public static final  /* enum */ d AIR;
    public static final  /* enum */ d CHAOS;
    private final  int runeId;
    private final  b cellType;
    public static final  /* enum */ d EARTH;
    public static final  /* enum */ d FIRE;
    private final  int talismanId;
    private static final  d[] $VALUES;
    public static final  /* enum */ d MIND;
    private final  WorldPoint location;
    public static final  /* enum */ d DEATH;
    private final  int levelRequired;
    public static final  /* enum */ d BLOOD;
    
    public static final  /* enum */ d COSMIC;
    private final  boolean isCatalytic;
    
    private final  int spriteId;
    public static final  /* enum */ d BODY;

    public String U() {
        String string = super.toString();
        return string.charAt(0) + string.substring(1).toLowerCase();
    }

    public boolean Z() {
        return this.isCatalytic;
    }

    public b aa() {
        return this.cellType;
    }

    public BufferedImage b(ItemManager itemManager) {
        return itemManager.getImage(this.talismanId);
    }

    public String T() {
        Object[] objectArray = new Object[1];
        objectArray[0] = this.U();
        return String.format(var1[0], objectArray);
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public int W() {
        return this.runeId;
    }

    public int Y() {
        return this.spriteId;
    }

    public int X() {
        return this.talismanId;
    }

    static {
        d.var3();
        d.var4();
        AIR = new GameEnum4(1, 2, 3, 4, 0, b.WEAK, new WorldPoint(5, 6, 0));
        MIND = new GameEnum4(7, 8, 9, var2[10], 1, b.WEAK, new WorldPoint(var2[11], 6, 0));
        WATER = new GameEnum4(var2[13], var2[14], var2[15], var2[16], 0, b.MEDIUM, new WorldPoint(var2[17], var2[18], 0));
        EARTH = new GameEnum4(var2[20], var2[21], var2[22], var2[23], 0, b.STRONG, new WorldPoint(var2[17], var2[24], 0));
        FIRE = new GameEnum4(var2[25], var2[26], var2[27], var2[28], 0, b.OVERCHARGED, new WorldPoint(5, var2[29], 0));
        BODY = new GameEnum4(var2[31], var2[32], var2[33], var2[34], 1, b.WEAK, new WorldPoint(var2[35], var2[36], 0));
        COSMIC = new GameEnum4(var2[38], var2[39], var2[40], var2[41], 1, b.MEDIUM, new WorldPoint(var2[42], var2[36], 0));
        CHAOS = new GameEnum4(var2[44], var2[45], var2[46], var2[47], 1, b.MEDIUM, new WorldPoint(var2[48], var2[49], 0));
        NATURE = new GameEnum4(var2[50], var2[51], var2[52], var2[53], 1, b.STRONG, new WorldPoint(var2[54], var2[55], 0));
        LAW = new GameEnum4(var2[57], var2[58], var2[59], var2[60], 1, b.STRONG, new WorldPoint(var2[61], var2[62], 0));
        DEATH = new GameEnum4(var2[64], var2[65], var2[66], var2[67], 1, b.OVERCHARGED, new WorldPoint(var2[48], var2[68], 0));
        BLOOD = new GameEnum4(var2[70], var2[71], var2[72], var2[73], 1, b.OVERCHARGED, new WorldPoint(var2[74], var2[29], 0));
        d[] dArray = new d[var2[69]];
        dArray[0] = AIR;
        dArray[1] = MIND;
        dArray[7] = WATER;
        dArray[d.var2[12]] = EARTH;
        dArray[d.var2[19]] = FIRE;
        dArray[d.var2[13]] = BODY;
        dArray[d.var2[30]] = COSMIC;
        dArray[d.var2[37]] = CHAOS;
        dArray[d.var2[43]] = NATURE;
        dArray[d.var2[20]] = LAW;
        dArray[d.var2[56]] = DEATH;
        dArray[d.var2[63]] = BLOOD;
        $VALUES = dArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public WorldPoint ab() {
        return this.location;
    }

    public int V() {
        return this.levelRequired;
    }

    private GameEnum4(int n3, int n4, int n5, int n6, boolean bl, b b2, WorldPoint worldPoint) {
        this.levelRequired = n3;
        this.runeId = n4;
        this.talismanId = n5;
        this.spriteId = n6;
        this.isCatalytic = bl;
        this.cellType = b2;
        this.location = worldPoint;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public BufferedImage a(ItemManager itemManager) {
        return itemManager.getImage(this.runeId);
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 0;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 0;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if ((0x44 ^ 0x1F ^ (0x72 ^ 0x2D)) != ((0x5C ^ 0x35 ^ (9 ^ 0x2B)) & (93 + 91 - 180 + 250 ^ 51 + 176 - 137 + 91 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var20);
    }
}

