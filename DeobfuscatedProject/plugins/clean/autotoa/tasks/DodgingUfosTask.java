/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging ufos", priority=100)
public class DodgingUfosTask
extends AutotoaTaskBase {

    @Inject
    protected DodgingUfosTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static  int w(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static boolean lIIlllIllIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIllIlIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var3_3;
        void var1;
        WorldPoint worldPoint2 = Players.getLocal().getWorldLocation();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bw.lIIlllIllIlIlI(fH.contains(tileObject.getId()) ? 1 : 0) && bw.lIIlllIllIlIlI(((GameObject)tileObject).getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                n2 = llIIIIlllII[2];

                }
            } else {
                n2 = llIIIIlllII[0];
            }
            return n2 != 0;
        });
        if (bw.lIIlllIllIlIIl(tileObject2)) {
            return llIIIIlllII[0];
        }
        WorldPoint var2 = var1.createWorldArea(llIIIIlllII[1]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bw.lIIlllIllIlIIl(TileObjects.getNearest(tileObject -> {
                int n2;
                if (bw.lIIlllIllIlIlI(fH.contains(tileObject.getId()) ? 1 : 0) && bw.lIIlllIllIlIlI(((GameObject)tileObject).getWorldArea().contains(worldPoint) ? 1 : 0)) {
                    n2 = llIIIIlllII[2];

                    if (-1 > -1) {
                        return ((0x50 ^ 0x17 ^ (0x1E ^ 2)) & (0 ^ 0x44 ^ (0x1D ^ 2) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllII[0];
                }
                return n2 != 0;
            }))) {
                bl2 = llIIIIlllII[2];

            } else {
                bl2 = llIIIIlllII[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(arg_0 -> bw.w((WorldPoint)var1, arg_0))).orElse(null);
        if (bw.lIIlllIllIlIIl(var2)) {
            return llIIIIlllII[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return llIIIIlllII[2];
    }

    static {
        bw.lIIlllIllIlIII();
    }
}

