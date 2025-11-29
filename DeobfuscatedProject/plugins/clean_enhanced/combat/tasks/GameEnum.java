/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.combat.tasks;

import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum
extends Enum<b> {
    private final  WorldPoint location;
    
    public static final  /* enum */ b HEROS;
    
    private final  String locationName;
    private static final  b[] $VALUES;
    public static final  /* enum */ b MYTHS_GUILD;
    private final  WorldArea dragonArea;
    private final  WorldPoint safeSpot;
    public static final  /* enum */ b TAVERLEY_DUNGEON;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < lllllllllllllllIlllIlIIlllIllllI2) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public WorldPoint o() {
        return this.location;
    }

    public WorldArea p() {
        return this.dragonArea;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(String string2, WorldPoint worldPoint, WorldArea worldArea, WorldPoint worldPoint2) {
        this.location = worldPoint;
        this.locationName = string2;
        this.dragonArea = worldArea;
        this.safeSpot = worldPoint2;
    }

    static {
        b.var19();
        b.var20();
        HEROS = new GameEnum(var1[1], new WorldPoint(2, 3, 0), new WorldArea(4, 5, 6, 7, 0), new WorldPoint(8, 3, 0));
        TAVERLEY_DUNGEON = new GameEnum(var1[var2[10]], new WorldPoint(var2[11], var2[12], 0), new WorldArea(var2[13], var2[14], var2[15], var2[16], 0), new WorldPoint(var2[17], var2[18], 0));
        MYTHS_GUILD = new GameEnum(var1[var2[20]], new WorldPoint(var2[21], var2[22], 1), new WorldArea(var2[23], var2[24], var2[25], var2[26], 1), new WorldPoint(var2[27], var2[28], 1));
        b[] bArray = new b[var2[10]];
        bArray[0] = HEROS;
        bArray[1] = TAVERLEY_DUNGEON;
        bArray[9] = MYTHS_GUILD;
        $VALUES = bArray;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    public WorldPoint q() {
        return this.safeSpot;
    }
}

