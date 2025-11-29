/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.construction.tasks;

import com.google.common.primitives.Ints;
import java.util.List;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum13
extends Enum<N> {
    public static final  /* enum */ N NECHRYAEL;
    private final  WorldPoint sw;
    private final  List<Integer> dropTable;
    private static  String[] llIlIlll;
    private final  WorldPoint second;
    private static final  N[] $VALUES;
    private final  int id;
    private final  WorldPoint ne;
    public static final  /* enum */ N SMOKE_DEVIL;
    private final  WorldPoint first;
    private static  int[] llIllIII;
    public static final  /* enum */ N DUST_DEVIL;

    public WorldPoint aJ() {
        return this.first;
    }

    public List<Integer> aL() {
        return this.dropTable;
    }

    private GameEnum13(int n3, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, WorldPoint worldPoint4, int ... nArray) {
        this.id = n3;
        this.first = worldPoint;
        this.second = worldPoint2;
        this.sw = worldPoint3;
        this.ne = worldPoint4;
        this.dropTable = Ints.asList((int[])nArray);
    }

    public boolean g(WorldPoint worldPoint) {
        return WorldPoint.isInZone((WorldPoint)this.sw, (WorldPoint)this.ne, (WorldPoint)worldPoint);
    }

    public static N valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    public static N[] values() {
        return (N[])$VALUES.clone();
    }

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = 0;
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = 0;
        while (var9 < var8) {
            char var10 = var7[var9];
            var4.append((char)(var10 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if ((0x5A ^ 0x39 ^ (0x27 ^ 0x40)) >= 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public int h(WorldPoint worldPoint) {
        return Math.min(worldPoint.distanceTo(this.first), worldPoint.distanceTo(this.second));
    }

    public int P() {
        return this.id;
    }

    public WorldPoint aK() {
        return this.second;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}

