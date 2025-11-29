/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging floor tiles", priority=105, blocking=true)
public class DodgingFloorTilesTask
extends AutotoaManager {
    private static final  int ef;
    private static final  List<Integer> ee;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var1 = new int[8];
        aO.var1[0] = (197 + 46 - 55 + 39 ^ 88 + 82 - 144 + 152) & (80 + 34 - 95 + 178 ^ 110 + 131 - 203 + 110 ^ -1);
        aO.var1[1] = 0x94 ^ 0x86 ^ (0x44 ^ 0x52);
        aO.var1[2] = 1;
        aO.var1[3] = -(37 + 128 - 124 + 106 ^ 134 + 104 - 142 + 55);
        aO.var1[4] = 2;
        aO.var1[5] = 3;
        aO.var1[6] = -(0xFFFFFC1E & 0x1BF7) & (0xFFFFFDBD & 0x1FFF);
        aO.var1[7] = -(0xFFFFDFC7 & 0x7779) & (0xFFFFFFFF & 0x5F7F);
    }

    static {
        aO.var5();
        ef = var1[6];
        ee = List.of(Integer.valueOf(var1[7]));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var4_4;
        aO var6;
        if (aO.var4(this.cW.redX() ? 1 : 0)) {
            return var1[0];
        }
        ArrayList var7 = new ArrayList();
        AtomicReference<Object> var8 = new AtomicReference<Object>(null);
        var6.cu.getGraphicsObjects().forEach(graphicsObject -> {
            void var9;
            if (aO.var4(ee.contains(graphicsObject.getId()) ? 1 : 0)) {
                var7.add(WorldPoint.fromLocal((Client)this.cu, (LocalPoint)graphicsObject.getLocation()));
                0;
            }
            if (aO.var3(var9.getId(), var1[6])) {
                void var10;
                var10.set(var9.getLocation());
            }
        });
        if (!aO.var2(var7.isEmpty() ? 1 : 0) || aO.var11(var8.get())) {
            return var1[0];
        }
        WorldPoint var12 = WorldPoint.fromLocal((Client)var6.cu, (LocalPoint)var8.get());
        WorldPoint[] worldPointArray = new WorldPoint[var1[1]];
        worldPointArray[aO.var1[0]] = var12.dx(var1[1]);
        worldPointArray[aO.var1[2]] = var12.dx(var1[3]);
        worldPointArray[aO.var1[4]] = var12.dy(var1[1]);
        worldPointArray[aO.var1[5]] = var12.dy(var1[3]);
        WorldPoint var13 = Stream.of(worldPointArray).filter(worldPoint -> {
            boolean bl2;
            if (aO.var2(var7.contains(worldPoint) ? 1 : 0)) {
                bl2 = var1[2];
                0;
                if null != null {
                    return ((0x1D ^ 0x57) & ~(0x2F ^ 0x65)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
        if (aO.var11(var13)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        return var1[2];
    }

    @Inject
    protected DodgingFloorTilesTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var11(Object object) {
        return object == null;
    }
}

