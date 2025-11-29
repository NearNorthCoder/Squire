/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import gg.squire.woodcutting.tasks.GameEnum;

@TaskDesc(name="Walking to next tile", priority=80)
public class WalkingToNextTileTask
extends Task {
    
    private final  SquireWoodcutterPlugin O;
    
    private final  SquireWoodcutterConfig P;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public WalkingToNextTileTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.O = squireWoodcutterPlugin;
        this.P = squireWoodcutterConfig;
    }

    private WorldPoint b(TileObject tileObject, i i2) {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return Walker.nearestWalkableTile((WorldPoint)tileObject.getWorldLocation(), worldPoint2 -> {
            int n;
            if ((i2.w( != 0).contains(worldPoint2) ? 1 : 0) && (worldPoint2.distanceTo(worldPoint) <= worldPoint2.distanceTo(worldPoint)2) && (worldPoint2.distanceToworldPoint)) {
                n = 1;
                0;
                if (((0x53 ^ 0x71 ^ (0x19 ^ 4)) & (0x5F ^ 0x42 ^ (0x59 ^ 0x7B) ^ -1)) != 0) {
                    return ((184 + 53 - 199 + 209 ^ 133 + 137 - 139 + 50) & (93 + 203 - 48 + 5 ^ 8 + 4 - -90 + 89 ^ -1)) != 0;
                }
            } else {
                n = 0;
            }
            return n != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        m var9;
        if ((this.P.fastTickChop( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var9.O.p( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var9.P.pickUpNest( != 0) ? 1 : 0) && (var9.O.a( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.isRunEnabled( == 0) ? 1 : 0)) {
            return 0;
        }
        TileObject var10 = TileObjects.getNearest(tileObject -> {
            int n;
            if ((tileObject.getName( != 0).equals(this.P.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[0];
                if ((tileObject.hasActionstringArray)) {
                    n = 1;
                    0;
                    if (-1 < 3) return n != 0;
                    return ((0x65 ^ 0x5E) & ~(0x46 ^ 0x7D)) != 0;
                }
            }
            n = 0;
            return n != 0;
        });
        if var10 == null {
            return 0;
        }
        i var11 = i.b(var10);
        Player var12 = Players.getLocal();
        if ((Object == nullllllllllllllllIllIIllIIIllllIlII)) {
            return 0;
        }
        if ((var12.distanceTo((Locatable)var10) <= var12.distanceTo((Locatable)var10)2))) {
            var9.O.h();
        }
        if ((var12.isMoving( != 0) ? 1 : 0)) {
            return 0;
        }
        WorldPoint var13 = var9.b(var10, var11);
        if var13 == null {
            return 0;
        }
        if ((var13.equals(ObjectPlayers.getLocal().getWorldLocation()) ? 1 : 0)) {
            return 0;
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.sleep(1);
        return 1;
    }

}

