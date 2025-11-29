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

    }

    private static boolean lIlllllIIlllIIl(int n2) {
        return n2 == 0;
    }

    static {
        S.lIlllllIIllIlll();
    }

    /*
     * WARNING - void declaration
     */
    public void a(WorldArea ... worldAreaArray) {
        void var1;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int n2 = worldAreaArray2.length;
        int var2 = lIlIlIlIIIIll[0];
        while (S.lIlllllIIlllIII(var2, (int)var1)) {
            S var3;
            void var4;
            void var5 = var4[var2];
            List list = var5.toWorldPointList();
            Set<WorldPoint> set = var3.cQ;
            Objects.requireNonNull(set);

            list.forEach(set::remove);
            ++var2;

            if (-1 == -1) continue;
            return;
        }
    }

    public void j(WorldPoint worldPoint) {
        this.cQ.remove(worldPoint);

    }

    private static boolean lIlllllIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public SHelper(Client client, WorldArea worldArea) {
        this.cQ = new HashSet<WorldPoint>();
        Stream<WorldPoint> stream = Tiles.getAll(tile -> {
            boolean bl;
            if (S.lIlllllIIlllIIl(tile.getPlane())) {
                bl = lIlIlIlIIIIll[1];

                }
            } else {
                bl = lIlIlIlIIIIll[0];
            }
            return bl;
        }).stream().filter(tile -> worldArea.contains(WorldPoint.fromLocalInstance((Client)client, (LocalPoint)tile.getLocalLocation()))).map(Locatable::getWorldLocation);
        Set<WorldPoint> set = this.cQ;
        Objects.requireNonNull(set);

        stream.forEach(set::add);
    }

    public boolean ai() {
        return this.cQ.isEmpty();
    }

    public void aj() {
        this.cQ.clear();
    }
}

