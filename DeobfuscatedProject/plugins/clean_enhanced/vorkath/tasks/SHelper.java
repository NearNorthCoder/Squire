/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.scene.Tiles
 */
package gg.squire.vorkath.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.scene.Tiles;

public class SHelper {
    private  Set<WorldPoint> cQ;

    public Set<WorldPoint> ak() {
        return this.cQ;
    }

    public void b(Predicate<WorldPoint> predicate) {
        this.cQ.removeIf(predicate);
        0;
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    static {
        S.var3();
    }

    /*
     * WARNING - void declaration
     */
    public void a(WorldArea ... worldAreaArray) {
        void var4;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int n2 = worldAreaArray2.length;
        int var5 = var1[0];
        while (S.var6(var5, (int)var4)) {
            S var7;
            void var8;
            void var9 = var8[var5];
            List list = var9.toWorldPointList();
            Set<WorldPoint> set = var7.cQ;
            Objects.requireNonNull(set);
            0;
            list.forEach(set::remove);
            ++var5;
            0;
            if (-1 == -1) continue;
            return;
        }
    }

    private static void var3() {
        var1 = new int[2];
        S.var1[0] = (0x84 ^ 0x82) & ~(0x51 ^ 0x57) & ~((0x3F ^ 0x36) & ~(0x9D ^ 0x94));
        S.var1[1] = 1;
    }

    public void j(WorldPoint worldPoint) {
        this.cQ.remove(worldPoint);
        0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    public SHelper(Client client, WorldArea worldArea) {
        this.cQ = new HashSet<WorldPoint>();
        Stream<WorldPoint> stream = Tiles.getAll(tile -> {
            boolean bl;
            if (S.var2(tile.getPlane())) {
                bl = var1[1];
                0;
                if null != null {
                    return ((30 + 150 - 29 + 4 ^ 116 + 42 - -18 + 15) & (0xC3 ^ 0x95 ^ (0xC6 ^ 0xB4) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }).stream().filter(tile -> worldArea.contains(WorldPoint.fromLocalInstance((Client)client, (LocalPoint)tile.getLocalLocation()))).map(Locatable::getWorldLocation);
        Set<WorldPoint> set = this.cQ;
        Objects.requireNonNull(set);
        0;
        stream.forEach(set::add);
    }

    public boolean ai() {
        return this.cQ.isEmpty();
    }

    public void aj() {
        this.cQ.clear();
    }
}

