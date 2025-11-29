/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.farmer.tasks;

import java.util.Comparator;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class GameEnum22
extends Enum<p> {
    private final  int radius;
    public static final  /* enum */ p FALADOR;
    private static final  p[] $VALUES;
    
    public static final  /* enum */ p WEISS;
    public static final  /* enum */ p MONASTERY;
    public static final  /* enum */ p FARMING_GUILD;
    public static final  /* enum */ p MORYTANIA;
    public static final  /* enum */ p GRAPE_VINE_KOUREND;
    public static final  /* enum */ p CHAMPIONS_GUILD;
    private final  WorldPoint worldPoint;
    public static final  /* enum */ p ARDOUGNE;
    public static final  /* enum */ p TROLLHEIM;
    public static final  /* enum */ p FOSSIL_ISLAND_UNDERWATER;
    public static final  /* enum */ p HARMONY;
    
    public static final  /* enum */ p HOSIDIUS;
    public static final  /* enum */ p CATHERBY;
    private final  int regionID;

    private GameEnum22(int n3, WorldPoint worldPoint) {
        this(n3, worldPoint, 0);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public int Z() {
        return this.radius;
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    static {
        p.var19();
        p.var20();
        FARMING_GUILD = new GameEnum22(2, new WorldPoint(3, 4, 1), 5);
        HOSIDIUS = new GameEnum22(7, new WorldPoint(8, 9, 1));
        TROLLHEIM = new GameEnum22(var1[11], new WorldPoint(var1[12], var1[13], 1));
        WEISS = new GameEnum22(var1[15], new WorldPoint(var1[16], var1[17], 1));
        CATHERBY = new GameEnum22(var1[19], new WorldPoint(var1[20], var1[21], 1), var1[22]);
        MORYTANIA = new GameEnum22(var1[24], new WorldPoint(var1[25], var1[26], 1));
        FALADOR = new GameEnum22(var1[28], new WorldPoint(var1[29], var1[30], 1));
        ARDOUGNE = new GameEnum22(var1[32], new WorldPoint(var1[33], var1[34], 1));
        HARMONY = new GameEnum22(var1[35], new WorldPoint(var1[36], var1[37], 1));
        MONASTERY = new GameEnum22(var1[39], new WorldPoint(var1[40], var1[41], 1), var1[22]);
        CHAMPIONS_GUILD = new GameEnum22(var1[43], new WorldPoint(var1[44], var1[45], 1), var1[22]);
        GRAPE_VINE_KOUREND = new GameEnum22(var1[47], new WorldPoint(var1[48], var1[49], 1), 0);
        FOSSIL_ISLAND_UNDERWATER = new GameEnum22(var1[51], new WorldPoint(var1[52], var1[53], 6), var1[22]);
        p[] pArray = new p[var1[54]];
        pArray[1] = FARMING_GUILD;
        pArray[6] = HOSIDIUS;
        pArray[p.var1[10]] = TROLLHEIM;
        pArray[p.var1[14]] = WEISS;
        pArray[p.var1[18]] = CATHERBY;
        pArray[p.var1[23]] = MORYTANIA;
        pArray[p.var1[27]] = FALADOR;
        pArray[p.var1[31]] = ARDOUGNE;
        pArray[p.var1[22]] = HARMONY;
        pArray[p.var1[38]] = MONASTERY;
        pArray[p.var1[42]] = CHAMPIONS_GUILD;
        pArray[p.var1[46]] = GRAPE_VINE_KOUREND;
        pArray[p.var1[50]] = FOSSIL_ISLAND_UNDERWATER;
        $VALUES = pArray;
    }

    public int X() {
        return this.regionID;
    }

    private GameEnum22(int n3, WorldPoint worldPoint, int n4) {
        this.regionID = n3;
        this.worldPoint = worldPoint;
        this.radius = n4;
    }

    /*
     * WARNING - void declaration
     */
    public static p b(int n2) {
        void var21;
        p[] pArray = p.values();
        int n3 = pArray.length;
        int var22 = 1;
        while ((var22 < (int)var21)) {
            int var23;
            void var24;
            void var25 = var24[var22];
            if ((var25.X() == var23)) {
                return var25;
            }
            ++var22;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return null;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public static p[] W() {
        Player player = Players.getLocal();
        if player == null {
            return p.values();
        }
        WorldPoint worldPoint = player.getWorldLocation();
        p[] pArray = p.values();
        Arrays.sort(pArray, Comparator.comparingInt(p2 -> p2.Y().distanceTo(worldPoint)));
        return pArray;
    }

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum22.class, string);
    }

    public WorldPoint Y() {
        return this.worldPoint;
    }
}

