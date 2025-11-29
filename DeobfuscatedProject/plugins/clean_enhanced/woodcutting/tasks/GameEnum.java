/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.client.Static
 */
package gg.squire.woodcutting.tasks;

import net.runelite.api.TileObject;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.client.Static;

public final class GameEnum
extends Enum<i> {
    private final  RectangularArea chopArea;
    public static final  /* enum */ i WEST;
    public static final  /* enum */ i EAST;
    private  long chopTimestamp;
    private final  int treeId;
    
    public static final  /* enum */ i MIDDLE;
    private static final  i[] $VALUES;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < llllllllllllllIllIIllIIlIIIIIlIl2) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public RectangularArea w() {
        return this.chopArea;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static i b(TileObject tileObject) {
        return Arrays.stream(i.values()).filter(i2 -> {
            boolean bl;
            if ((i2.v() == i2.v()2))) {
                bl = 0;
                0;
                if null != null {
                    return ((0x53 ^ 0x78 ^ (0x1F ^ 0x2D)) & (142 + 138 - 118 + 22 ^ 96 + 123 - 196 + 138 ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).findFirst().orElse(null);
    }

    public int v() {
        return this.treeId;
    }

    static {
        i.var19();
        i.var20();
        WEST = new GameEnum(2, new RectangularArea(3, 4, 3, 5));
        MIDDLE = new GameEnum(6, new RectangularArea(7, 8, 9, 8));
        EAST = new GameEnum(var1[11], new RectangularArea(var1[12], var1[13], var1[12], 5));
        i[] iArray = new i[var1[14]];
        iArray[1] = WEST;
        iArray[0] = MIDDLE;
        iArray[i.var1[10]] = EAST;
        $VALUES = iArray;
    }

    private GameEnum(int n2, RectangularArea rectangularArea) {
        this.treeId = n2;
        this.chopArea = rectangularArea;
    }

    public long u() {
        return this.chopTimestamp + 15L - (long)Static.getClient().getTickCount();
    }

    public void a(long l2) {
        this.chopTimestamp = l2;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

