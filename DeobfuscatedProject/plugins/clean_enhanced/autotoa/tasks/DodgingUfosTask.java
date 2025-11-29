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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging ufos", priority=100)
public class DodgingUfosTask
extends AutotoaManager {

    @Inject
    protected DodgingUfosTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static  int w(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[3];
        bw.var1[0] = (47 + 36 - 22 + 68 ^ 5 + 58 - -69 + 28) & (0x68 ^ 0x1F ^ (0x53 ^ 5) ^ -1);
        bw.var1[1] = 0x6A ^ 0x16 ^ (0x44 ^ 0x3D);
        bw.var1[2] = 1;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var3_3;
        void var5;
        WorldPoint worldPoint2 = Players.getLocal().getWorldLocation();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bw.var2(fH.contains(tileObject.getId()) ? 1 : 0) && bw.var2(((GameObject)tileObject).getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if null != null {
                    return ((18 + 171 - 38 + 36 ^ 12 + 95 - 17 + 66) & (156 + 174 - 321 + 168 ^ 64 + 0 - -5 + 81 ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (bw.var4(tileObject2)) {
            return var1[0];
        }
        WorldPoint var6 = var5.createWorldArea(var1[1]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bw.var4(TileObjects.getNearest(tileObject -> {
                int n2;
                if (bw.var2(fH.contains(tileObject.getId()) ? 1 : 0) && bw.var2(((GameObject)tileObject).getWorldArea().contains(worldPoint) ? 1 : 0)) {
                    n2 = var1[2];
                    0;
                    if (-1 > -1) {
                        return ((0x50 ^ 0x17 ^ (0x1E ^ 2)) & (0 ^ 0x44 ^ (0x1D ^ 2) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            }))) {
                bl2 = var1[2];
                0;
                if (-2 >= 0) {
                    return ((0x68 ^ 0x67) & ~(0x47 ^ 0x48)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(arg_0 -> bw.w((WorldPoint)var5, arg_0))).orElse(null);
        if (bw.var4(var6)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return var1[2];
    }

    static {
        bw.var3();
    }
}

