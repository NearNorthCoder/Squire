/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Walking on green orbs", priority=50, blocking=true)
public class WalkingOnGreenOrbsTask
extends WhispererTaskBase {
    
    private static final  int ah;
    private static final  int ag;

    static {
        C.var2();
        ag = 4;
        ah = 4;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var5_6;
        C var3;
        if ((this.W.f( == 0) ? 1 : 0)) {
            return 0;
        }
        Player var4 = Players.getLocal();
        List var5 = var4.getWorldLocation().dx(1).dy(1).createWorldArea(2, 2).toWorldPointList().stream().filter(Reachable::isWalkable).collect(Collectors.toList());
        int[] nArray = new int[3];
        nArray[0] = 4;
        int[] nArray2 = new int[3];
        nArray2[0] = 4;
        TileObject var6 = TileObjects.getAll((int[])nArray).stream().filter(tileObject -> var5.contains(tileObject.getWorldLocation())).max(Comparator.comparingDouble(tileObject -> tileObject.getWorldLocation().distanceTo2DHypotenuse(this.W.j().getWorldLocation()))).orElse(TileObjects.getNearest((int[])nArray2));
        if var6 == null {
            return 0;
        }
        int var7 = var6.distanceTo((Locatable)var4);
        if (var7 <= 5) {
            WorldPoint var8 = var6.getWorldLocation();
            if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
                int[] nArray3 = new int[3];
                nArray3[0] = 4;
                TileObject var9 = TileObjects.getAll((int[])nArray3).stream().filter(tileObject -> var5.contains(tileObject.getWorldLocation())).filter(tileObject2 -> {
                    boolean bl;
                    if (tileObject2 != tileObject22) {
                        bl = 3;
                        0;
                        if (((48 + 52 - 55 + 191 ^ 34 + 77 - -43 + 39) & (89 + 119 - 114 + 38 ^ 111 + 20 - 83 + 121 ^ -1)) != 0) {
                            return ((20 + 22 - -111 + 27 ^ 69 + 129 - 56 + 22) & (0x6B ^ 0x62 ^ (0xB ^ 0x12) ^ -1)) != 0;
                        }
                    } else {
                        bl = 0;
                    }
                    return bl;
                }).max(Comparator.comparingDouble(tileObject -> tileObject.getWorldLocation().distanceTo2DHypotenuse(this.W.j().getWorldLocation()))).orElse(var6);
                var8 = var9.getWorldLocation();
            }
            Movement.setDestination((WorldPoint)var8);
            return 3;
        }
        WorldPoint var8 = var5.stream().filter(worldPoint -> TileObjects.getAll(tileObject -> tileObject.getWorldLocation().equals(worldPoint)).isEmpty()).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(var6.getWorldLocation()))).orElse(null);
        if var8 == null {
            return 0;
        }
        Movement.setDestination((WorldPoint)var5_6);
        return 3;
    }
}

