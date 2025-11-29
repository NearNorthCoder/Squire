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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging floor tiles", priority=105, blocking=true)
public class DodgingFloorTilesTask
extends AutotoaTaskBase {
    private static final  int ef;
    private static final  List<Integer> ee;

    private static boolean lIIlllIIIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIIIllIlI(int n2) {
        return n2 != 0;
    }

    static {
        aO.lIIlllIIIllIIl();
        ef = llIIIIIIlII[6];
        ee = List.of(Integer.valueOf(llIIIIIIlII[7]));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var4_4;
        aO var1;
        if (aO.lIIlllIIIllIlI(this.cW.redX() ? 1 : 0)) {
            return llIIIIIIlII[0];
        }
        ArrayList var2 = new ArrayList();
        AtomicReference<Object> var3 = new AtomicReference<Object>(null);
        var1.cu.getGraphicsObjects().forEach(graphicsObject -> {
            void var4;
            if (aO.lIIlllIIIllIlI(ee.contains(graphicsObject.getId()) ? 1 : 0)) {
                var2.add(WorldPoint.fromLocal((Client)this.cu, (LocalPoint)graphicsObject.getLocation()));

            }
            if (aO.lIIlllIIIlllIl(var4.getId(), llIIIIIIlII[6])) {
                void var5;
                var5.set(var4.getLocation());
            }
        });
        if (!aO.lIIlllIIIllIll(var2.isEmpty() ? 1 : 0) || aO.lIIlllIIIlllII(var3.get())) {
            return llIIIIIIlII[0];
        }
        WorldPoint var6 = WorldPoint.fromLocal((Client)var1.cu, (LocalPoint)var3.get());
        WorldPoint[] worldPointArray = new WorldPoint[llIIIIIIlII[1]];
        worldPointArray[aO.llIIIIIIlII[0]] = var6.dx(llIIIIIIlII[1]);
        worldPointArray[aO.llIIIIIIlII[2]] = var6.dx(llIIIIIIlII[3]);
        worldPointArray[aO.llIIIIIIlII[4]] = var6.dy(llIIIIIIlII[1]);
        worldPointArray[aO.llIIIIIIlII[5]] = var6.dy(llIIIIIIlII[3]);
        WorldPoint var7 = Stream.of(worldPointArray).filter(worldPoint -> {
            boolean bl2;
            if (aO.lIIlllIIIllIll(var2.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIIIIIlII[2];

                }
            } else {
                bl2 = llIIIIIIlII[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
        if (aO.lIIlllIIIlllII(var7)) {
            return llIIIIIIlII[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        return llIIIIIIlII[2];
    }

    @Inject
    protected DodgingFloorTilesTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIlllIIIlllII(Object object) {
        return object == null;
    }
}

